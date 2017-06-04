set nocompatible              " be iMproved, required

" Since I use linux, I want this
let g:clipbrdDefaultReg = '+'

" set the runtime path to include Vundle and initialize
set runtimepath^=~/.vim/bundle/ctrlp.vim


filetype off
"+++++++++++++++++++++ Vundle ++++++++++++++++++++++

set rtp+=~/.vim/bundle/Vundle.vim
call vundle#begin()
" alternatively, pass a path where Vundle should install plugins
"call vundle#begin('~/some/path/here')

Plugin 'VundleVim/Vundle.vim'
Plugin 'Valloric/YouCompleteMe'
"Plugin 'ctrlpvim/ctrl.vim'
Plugin 'tpope/vim-surround'
Plugin 'scrooloose/syntastic'
Plugin 'terryma/vim-multiple-cursors'
Plugin 'bling/vim-airline'
Plugin 'chriskempson/base16-vim'
Plugin 'chriskempson/vim-tomorrow-theme'
Plugin 'vim-airline/vim-airline-themes'
Plugin 'davidhalter/jedi-vim'
Plugin 'klen/python-mode'
Plugin 'powerline/powerline'
Plugin 'jiangmiao/auto-pairs'
Plugin 'nvie/vim-flake8'
Plugin 'scrooloose/nerdtree'
Plugin 'wincent/pinnacle'
call vundle#end()            " required

" Put your non-Plugin stuff after this line

"++++++++++++++++++++++++++++++++++++++++++++++++++

"execute 'highlight Comment ' .pinnacle#italicize('Comment')

let mapleader=" "
"filetype plugin indent on
set autoindent
set tabstop=8
set shiftwidth=4
set expandtab
set nu
set softtabstop=4
syntax on
:set ttyfast
:set lazyredraw
:set modeline

set ttimeout
set ttimeoutlen=20
set notimeout



"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



au WinLeave * set nocursorline nocursorcolumn
au WinEnter * set cursorline
set cursorline

set ruler         " show the cursor position all the time
set showcmd       " display incomplete commands
set incsearch     " do incremental searching
set hlsearch      " highlight matches
set laststatus=2  " Always display the status line
set autowrite 
set backspace=2   " Backspace deletes like most programs in insert mode
set nocompatible  " Use Vim settings, rather then Vi settings
set nobackup
set nowritebackup
set noswapfile    " http://robots.thoughtbot.com/post/18739402579/global-gitignore#comment-458413287
set history=500

set splitbelow
set splitright

imap jk <esc>


"++++++++++++++++++++++++++++++++++++++++++++++++++

"let g:airline_left_sep='>'
"let g:airline_right_sep='<'
let g:airline_detect_modified=1
let g:airline_detect_paste=1
let g:airline_powerline_fonts = 1                                          

let g:python_highlight_all = 1

"++++++++++++++++ Airline options +++++++++++++


let g:airline_powerline_fonts=1
let g:airline_theme='minimalist'
let g:airline#extensions#tabline#enabled = 1 " enable airline tabline
let g:airline#extensions#tabline#tab_min_count = 2 " only show tabline if tabs are being used (more than 1 tab open)
let g:airline#extensions#tabline#show_buffers = 0 " do not show open buffers in tabline
let g:airline#extensions#tabline#show_splits = 0

" clear highlighted search
noremap zz :set hlsearch! hlsearch?<cr>




"+++++++++++++ Pymode ++++++++++++++++++++++++

let g:pymode = 1
let g:pymode_options = 1
let g:pymode_doc = 1
let g:pymode_run = 1
let g:pymode_run_bind = '<leader>r'
let g:pymode_lint = 1

"++++++++++++ Terminal Emulator +++++++++++++++++

: tnoremap <Caps-Lock> <C-\><C-n>


    :tnoremap <A-h> <C-\><C-n><C-w>h
    :tnoremap <A-j> <C-\><C-n><C-w>j
    :tnoremap <A-k> <C-\><C-n><C-w>k
    :tnoremap <A-l> <C-\><C-n><C-w>l
    :nnoremap <A-h> <C-w>h
    :nnoremap <A-j> <C-w>j
    :nnoremap <A-k> <C-w>k
    :nnoremap <A-l> <C-w>l

"This configuration allows using `Alt+{h,j,k,l}` to navigate between windows o

set t_Co=256
if $TERM == "xterm-256color"
  set t_Co=256
endif

"+++++++++++++++++++++ Base 16 +++++++++++++++++++++++++

let base16colorspace=256  " Access colors present in 256 colorspace

if filereadable(expand("~/.vimrc_background"))
  let base16colorspace=256
  source ~/.vimrc_background
endif
